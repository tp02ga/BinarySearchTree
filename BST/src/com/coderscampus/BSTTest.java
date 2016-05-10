package com.coderscampus;

import org.junit.Test;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

public class BSTTest
{
  
  // TDD - Test Driven Development
  // 1. Create a failing test 
  // 2. Code the solution so that the test passes
  // 3. Refactor your code
  
  
  @Test
  public void should_insert_one_node_into_BST_and_test_one_level_deep ()
  {
    // arrange
    BST<Integer, String> sut = new BST<Integer, String>();
    
    // act
    sut.insert(50, "50");
    
    // assert
    assertThat(sut.get(50), is("50"));
  }
  
  @Test
  public void should_insert_three_nodes_into_BST_and_test_two_levels_deep ()
  {
    // arrange
    BST<Integer, String> sut = new BST<Integer, String>();
    
    // act
    sut.insert(50, "50");
    sut.insert(45, "45");
    sut.insert(55, "55");
    
    // assert
    assertThat(sut.get(50), is("50"));
    assertThat(sut.get(45), is("45"));
    assertThat(sut.get(55), is("55"));
  }
  
  @Test
  public void should_insert_seven_nodes_into_BST_and_test_three_levels_deep ()
  {
    // arrange
    BST<Integer, String> sut = new BST<Integer, String>();
    
    // act
    sut.insert(50, "50");
    sut.insert(45, "45");
    sut.insert(55, "55");
    sut.insert(40, "40");
    sut.insert(47, "47");
    sut.insert(51, "51");
    sut.insert(60, "60");
    sut.insert(30, "30");
    
    // assert
    assertThat(sut.get(50), is("50"));
    assertThat(sut.get(45), is("45"));
    assertThat(sut.get(55), is("55"));
    assertThat(sut.get(40), is("40"));
    assertThat(sut.get(47), is("47"));
    assertThat(sut.get(51), is("51"));
    assertThat(sut.get(60), is("60"));
    assertThat(sut.get(30), is("30"));
  }
  
}
