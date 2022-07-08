package com.jwetherell.algorithms.data_structures.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.jwetherell.algorithms.data_structures.SuffixTree;
import com.jwetherell.algorithms.data_structures.test.common.SuffixTreeTest;

public class SuffixTreeTests {

    @Test
    public void testSuffixTree() {
        String bookkeeper = "bookkeeper";
        SuffixTree<String> tree = new SuffixTree<String>(bookkeeper);
        assertTrue(SuffixTreeTest.suffixTreeTest(tree, bookkeeper));
    }
}
