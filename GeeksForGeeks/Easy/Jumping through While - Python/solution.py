def printIncreasingPower(x):
    # Initialize the base number
    i = 1
    
    # Loop to jump in powers of 2
    while (i * i <= x):
        # Calculate the perfect square
        square = i * i
        
        print (square, end = " ")
        
        # Increment the base number
        i += 1
