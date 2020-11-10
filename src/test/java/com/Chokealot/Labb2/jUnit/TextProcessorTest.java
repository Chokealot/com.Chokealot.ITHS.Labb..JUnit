package com.Chokealot.Labb2.jUnit;

import com.Chokealot.Labb2.jUnit.TextProcessor;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class TextProcessorTest {

        public static StringBuilder stringBuilder = new StringBuilder();

        public static TextProcessor tp = new TextProcessor();

        @BeforeAll
        public static void testMessageBeforeAll() {
                System.out.println("Test - com.Chokealot.Labb2.jUnit.TextProcessor initiated!");
        }

        @AfterAll
        public static void testMessageAfterAll()        {
                System.out.println("Test - com.Chokealot.Labb2.jUnit.TextProcessor completed");
        }

        @ParameterizedTest
        @ValueSource(strings = {"sTeEvEee", "HejSaNNn", "ItS a BEasT In HERE"})
        public void testCheck(String str)       {
                assertTrue(str != tp.upperCase(str));
                assertTrue(str != tp.lowerCase(str));
                assertTrue(str != tp.reverseString(str));
        }

        @ParameterizedTest
        @DisplayName("TestIfUppercaseIsTrue")
        @ValueSource(strings = {"sTeEvEee", "HejSaNNn", "ItS a BEasT In HERE"})
        public void testIfUpperCaseIsTrue(String str)   {
                assertTrue(str != tp.upperCase(str));
                assertNotSame(str, tp.upperCase(str));
        }

        @ParameterizedTest
        @ValueSource(strings = {"sTeEvEee", "HejSaNNn", "ItS a BEasT In HERE"})
        public void testUpperCase(String str) {
                assertEquals(str.toUpperCase(), tp.upperCase(str));
                assertFalse(str == tp.upperCase(str));
        }

        @ParameterizedTest
        @ValueSource(strings = {"sTeEvEee", "HejSaNNn", "ItS a BEasT In HERE"})
        public void TestLowerCase(String str) {
            assertEquals(str.toLowerCase(), tp.lowerCase(str));
            assertNotSame(str,tp.lowerCase(str));
        }

        @ParameterizedTest
        @ValueSource(strings = {"sTeEvEee", "HejSaNNn", "ItS a BEasT In HERE"})
        public void testReverseString(String str) {
                assertEquals(new StringBuilder(str).reverse().toString(), tp.reverseString(str));
        }

        @Disabled
        @ParameterizedTest
        @ValueSource(strings = {"sTeEvEee", "HejSaNNn", "ItS a BEasT In HERE"})
        public void testIfStringIsSame(String str)   {
                assertTrue(str != tp.reverseString(str));
        }

        @Test
        @AfterEach
        @DisplayName("Test of TP")
        public void testIfReversed()    {
             assertNotNull(tp);
        }
    }


