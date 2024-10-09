package org.example.l_120805

import org.junit.jupiter.api.Assertions.*


import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {

    @Test
    fun testSolution1() {
        val solution = Solution()
        // 테스트 데이터
        var num1 = 10
        var num2 = 5
        var result = 2

        val solutionResult = solution.solution(num1, num2)
        assertEquals(result, solutionResult)
    }

    @Test
    fun testSolution2() {
        val solution = Solution()
        // 테스트 데이터
        var num1 = 7
        var num2 = 2
        var result = 3

        val solutionResult = solution.solution(num1, num2)
        assertEquals(result, solutionResult)
    }
}