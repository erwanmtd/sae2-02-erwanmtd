char* erase(char* chaine) {
  
  char* chaine2 = calloc(strlen(chaine),sizeof(int));
  
  int i = 0;
  int j = 0;
   
   while (chaine[i] != '\0') {
      if ((chaine[i] == ' ' && chaine[i+1] != ' ' && chaine[i-1] != ' ') != 1) {
        chaine2[j] = chaine[i];
        j++;
      }
      i++;
   }
   
   chaine2[j] = '\0';

   printf("Après la suppression des espaces :'%s' ", chaine2);
    
   
   free(chaine2);
}
