/*
 * Copyright (c) 2016 the original author or authors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.eclipse.buildship.core.workspace;

import com.google.common.base.Optional;

import com.gradleware.tooling.toolingmodel.repository.FixedRequestAttributes;

import org.eclipse.core.resources.IProject;

/**
 * Manages the Gradle builds that are contained in the current Eclipse workspace.
 *
 * @author Stefan Oehme
 */
public interface GradleWorkspaceManager {

    /**
     * Returns the {@link OldGradleBuild} represented by the given request attributes.
     *
     * @param attributes the request attributes, must not be null
     * @return the Gradle build, never null
     */
    public OldGradleBuild getOldGradleBuild(FixedRequestAttributes attributes);

    /**
     * Returns the {@link OldGradleBuild} that contains the given project.
     * <p/>
     * If the given project is not a Gradle project, {@link Optional#absent()} is returned.
     *
     * @param project the project, must not be null
     * @return the Gradle build or {@link Optional#absent()}
     */
    public Optional<OldGradleBuild> getOldGradleBuild(IProject project);

    public GradleBuild getGradleBuild(FixedRequestAttributes attributes);

    public Optional<GradleBuild> getGradleBuild(IProject project);

}
