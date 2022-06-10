def erase(cc):
    if cc == " ":
        return ""
    if cc == "":
        return ""

    # On recopie toute la chaine dans une liste
    liste = list(cc)

    # On teste si le premier caractère est un espace
    if liste[0] == " ":
        # Si c'est le cas, on teste seulement si celui d'après n'est pas un espace
        if liste[1] != " ":
            # On enlève l'espace seul
            liste.pop(0)
            
    # On teste le milieu de la chaine en testant cette fois avant puis après
    i = 0
    while i < len(liste)-1:
        if liste[i] == " ":
            if liste[i+1] != " ":
                if liste[i-1] != " ":
                    liste.pop(i)
                else:
                    i+=1
            else:
                i+=1
        else:
            i+=1
    
    # On teste le dernier caractère en testant le précédent
    if liste[i] == " ":
        if liste[i-1] != " ":
            liste.pop(i)

    return "".join(liste)
