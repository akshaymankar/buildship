/*
 * Copyright (c) 2016 the original author or authors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */
package org.eclipse.buildship.core.workspace;

import org.gradle.tooling.CancellationToken;

import com.gradleware.tooling.toolingmodel.OmniBuildEnvironment;
import com.gradleware.tooling.toolingmodel.OmniEclipseGradleBuild;
import com.gradleware.tooling.toolingmodel.OmniGradleBuild;
import com.gradleware.tooling.toolingmodel.repository.FetchStrategy;

import org.eclipse.core.runtime.IProgressMonitor;

/**
 * Provides models in the scope of a single gradle build.
 *
 * @author Stefan Oehme
 */
// TODO we should refactor this and tooling-commons to allow arbitrary models instead of a fixed set
public interface OldModelProvider {

    /**
     * Fetches the {@link OmniGradleBuild}.
     *
     * @param fetchStrategy the caching strategy
     * @param token the cancellation token or null if cancellation is not required
     * @param monitor the monitor to report progress on or null if progress reporting is not required
     * @return the model or null if caching was disabled and no value was cached
     */
    OmniGradleBuild fetchGradleBuild(FetchStrategy fetchStrategy, CancellationToken token, IProgressMonitor monitor);

    /**
     * Fetches the {@link OmniEclipseGradleBuild}.
     *
     * @param fetchStrategy the caching strategy
     * @param token the cancellation token or null if cancellation is not required
     * @param monitor the monitor to report progress on or null if progress reporting is not required
     * @return the model or null if caching was disabled and no value was cached
     */
    OmniEclipseGradleBuild fetchEclipseGradleBuild(FetchStrategy fetchStrategy, CancellationToken token, IProgressMonitor monitor);

    /**
     * Fetches the {@link OmniBuildEnvironment}.
     *
     * @param fetchStrategy the caching strategy
     * @param token the cancellation token or null if cancellation is not required
     * @param monitor the monitor to report progress on or null if progress reporting is not required
     * @return the model or null if caching was disabled and no value was cached
     */
    OmniBuildEnvironment fetchBuildEnvironment(FetchStrategy fetchStrategy, CancellationToken token, IProgressMonitor monitor);
}
