/*******************************************************************************
 * Copyright (c) 2005, 2006 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.equinox.device;

import org.eclipse.osgi.util.NLS;

public class LogTrackerMsg extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.equinox.device.LogMessages"; //$NON-NLS-1$

	public static String Unknown_Log_level;
	public static String Info;
	public static String Warning;
	public static String Error;

	static {
		// initialize resource bundles
		NLS.initializeMessages(BUNDLE_NAME, LogTrackerMsg.class);
	}
}
