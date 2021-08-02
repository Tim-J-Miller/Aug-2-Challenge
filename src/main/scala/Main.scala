/*
Weekly Coding Challenge:

Problem 1: Given two Strings A and B. Find the length of the Longest Common Subsequence (LCS) of the given Strings. Input: A = Minneapolis, B = Minnesota.

Problem 2: Write java Program to Find Smallest and Largest Element in an Array.
Note: Number can not be repeated in the array.

For example:
1
2
3
4
5
6

int[] arr1={7,5,6,1,4,2};
Missing number : 3
int[] arr2={5,3,1,2};
Missing number : 4

Logical Reasoning:
3) This question is based on a certain code language. Understand the logic in the coding and answer the following question.

If PROCESSOR is coded as D4F3C5C1E1S1S1E3C6, what is the code for QUADRANT?
*/

object Main extends App {
  val (inA, inB) = ("Minneapolis", "Minnesota")
  
  println(longestCommonSubstring(inA, inB).length())
  
  def getAllSubstrings(str: String): Set[String] = {
    str.inits.flatMap(_.tails).toSet
  }
  def longestCommonSubstring(str1: String, str2: String): String = {
    val str1Substrings = getAllSubstrings(str1)
    val str2Substrings = getAllSubstrings(str2)

    str1Substrings.intersect(str2Substrings).maxBy(_.length)
  }
}