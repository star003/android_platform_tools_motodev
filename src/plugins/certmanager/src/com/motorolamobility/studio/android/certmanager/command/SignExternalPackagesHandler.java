/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.motorolamobility.studio.android.certmanager.command;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler2;
import org.eclipse.jface.action.Action;

import com.motorolamobility.studio.android.certmanager.ui.action.SignCreatedPackageAction;

/**
 * Handler to execute the sign package wizard.
 * */
public class SignExternalPackagesHandler extends AbstractHandler2 implements IHandler2
{

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException
    {
        Action action = new SignCreatedPackageAction();
        action.run();
        return null;
    }

}
