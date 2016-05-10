package com.coderscampus;

public class BST <K extends Comparable<K>, V>
{
  Node<K, V> root;
  
  public void insert(K key, V value)
  {
    if (root == null)
    {
      root = new Node<K, V>(key, value);
    }
    else
    {
      if (key.compareTo(root.getEntry().getKey()) < 0)
      {
        if (root.left == null)
        {
          root.left = new Node<K, V> (key, value);
        }
        else
        {
          root.left.insert(key, value);
        }
      }
      else if (key.compareTo(root.getEntry().getKey()) > 0)
      {
        if (root.right == null)
        {
          root.right = new Node<K, V> (key, value);
        }
        else
        {
          root.right.insert(key, value);
        }
      }
    }
  }

  public V get(K key)
  {
    if (root == null)
    {
      return null;
    }
    else
    {
      if (root.getEntry().getKey().equals(key))
      {
        return root.getEntry().getValue();
      }
      else
      {
        if (key.compareTo(root.getEntry().getKey()) < 0)
        {
          return root.left.get(key);
        }
        else if (key.compareTo(root.getEntry().getKey()) > 0)
        {
          return root.right.get(key);
        }
      }
    }
    return null;
  }
  
}
