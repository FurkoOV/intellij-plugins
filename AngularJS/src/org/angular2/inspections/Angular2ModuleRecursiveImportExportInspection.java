// Copyright 2000-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package org.angular2.inspections;

public class Angular2ModuleRecursiveImportExportInspection extends Angular2ModuleConfigurationInspection {
  public Angular2ModuleRecursiveImportExportInspection() {
    super(ProblemType.RECURSIVE_IMPORT_EXPORT);
  }
}