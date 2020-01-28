/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.perf;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/copyPaste/literal")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class PerformanceLiteralKotlinToKotlinCopyPasteTestGenerated extends AbstractPerformanceLiteralKotlinToKotlinCopyPasteTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doPerfTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInLiteral() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/copyPaste/literal"), Pattern.compile("^([^\\.]+)\\.kt$"), null, true);
    }

    @TestMetadata("CollectionLiteralReference.kt")
    public void testCollectionLiteralReference() throws Exception {
        runTest("idea/testData/copyPaste/literal/CollectionLiteralReference.kt");
    }

    @TestMetadata("DontEscapeEntries.kt")
    public void testDontEscapeEntries() throws Exception {
        runTest("idea/testData/copyPaste/literal/DontEscapeEntries.kt");
    }

    @TestMetadata("DontEscapeEntries2.kt")
    public void testDontEscapeEntries2() throws Exception {
        runTest("idea/testData/copyPaste/literal/DontEscapeEntries2.kt");
    }

    @TestMetadata("DontEscapeThis.kt")
    public void testDontEscapeThis() throws Exception {
        runTest("idea/testData/copyPaste/literal/DontEscapeThis.kt");
    }

    @TestMetadata("DontUnescapeLiteralWIthCode.kt")
    public void testDontUnescapeLiteralWIthCode() throws Exception {
        runTest("idea/testData/copyPaste/literal/DontUnescapeLiteralWIthCode.kt");
    }

    @TestMetadata("UnescapeFullSelection.kt")
    public void testUnescapeFullSelection() throws Exception {
        runTest("idea/testData/copyPaste/literal/UnescapeFullSelection.kt");
    }
}