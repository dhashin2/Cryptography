def checkISBN(isbn):

    if len(isbn) != 10: #check length of the number
        return False

    total = 0
    for i in range(9): #getting sum of first 9 digits
        if 0 <= int(isbn[i]) <= 9:
            total += int(isbn[i]) * (10 - i)
        else:
            return False

    if(isbn[9]) == 'X': #checking if last digit is x or a number
        total += 10 #if it is X then substitute with 10
    else:
        total += int(isbn[9]) #if not X then use the number in the 9th digit

    return (total % 11 ==0) #getting modulas

print('Enter ISBN')

isbn = input() #get user input for isbn
if checkISBN(isbn): #if true print valid
    print('Valid')
else: #else invalid
    print('Invalid')