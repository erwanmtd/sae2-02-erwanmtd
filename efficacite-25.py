# return string without spaces
def erase(cc):
    newStr = ""
    cmpt = 0
    j = 0

    for k in cc :
        if k == ' ' :
            cmpt += 1
        else :
            if cmpt > 1:

                while j < cmpt :
                    j +=1
                    newStr += " "

            cmpt = 0
            newStr += k
            j=0
    return newStr

