package com.coderscampus;

public class Node <K extends Comparable<K>, V>
{
  Node<K, V> left;
  Node<K, V> right;
  Entry<K, V> entry;
  
  public void insert(K key, V value)
  {
    if (entry == null)
    {
      entry = new Entry<K, V> (key, value);
      return;
    }
    else
    {
      if (key.compareTo(this.getEntry().getKey()) < 0)
      {
        if (this.left == null)
        {
          this.left = new Node<K, V> (key, value);
        }
        else
        {
          this.left.insert(key, value);
        }
      }
      else if (key.compareTo(this.getEntry().getKey()) > 0)
      {
        if (this.right == null)
        {
          this.right = new Node<K, V> (key, value);
        }
        else
        {
          this.right.insert(key, value);
        }
      }
    }
    
  }
  
  public V get(K key)
  {
    if (key.equals(entry.getKey()))
    {
      return entry.getValue();
    }
    else
    {
      if (key.compareTo(this.getEntry().getKey()) < 0)
      {
        return this.left.get(key);
      }
      else if (key.compareTo(this.getEntry().getKey()) > 0)
      {
        return this.right.get(key);
      }
    }
    return null;
  }
  
  public Node(K key, V value)
  {
    entry = new Entry<K,V> (key, value);
  }
  public Node<K, V> getLeft()
  {
    return left;
  }
  public void setLeft(Node<K, V> left)
  {
    this.left = left;
  }
  public Node<K, V> getRight()
  {
    return right;
  }
  public void setRight(Node<K, V> right)
  {
    this.right = right;
  }
  public Entry<K, V> getEntry()
  {
    return entry;
  }
  public void setEntry(Entry<K, V> entry)
  {
    this.entry = entry;
  }


}
