def Sum(L, i, n, count):
  
    if n <= i:
        return count
    
    count += L[i]

    count = Sum(L, i + 1, n, count)
    return count
