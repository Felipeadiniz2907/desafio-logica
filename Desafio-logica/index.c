#include <stdio.h>
#include <stdlib.h>

int main(void){
    char heroi[10] = "Felipe";
    char nivel[20];
    int xp = 7500;

    if (xp <= 1000)
    nivel[20] = "Ferro";
    else if (xp >= 1001 && xp <= 2000)
    nivel[20] = "Bronze";
    else if (xp >= 2001 && xp <= 5000)
    nivel[20] = "Prata";
    else if (xp >= 5001 && xp <= 7000)
    nivel[20] = "Ouro";
    else if (xp >= 7001 && xp <=8000)
    nivel[20] = "Platina";
    else if (xp >= 8001 && xp <= 9000)
    nivel[20] = "Ascendente";
    else if (xp >= 9001 && xp <= 10000)
    nivel[20] = "Imortal";
    else if (xp >= 10001)
    nivel[20] = "Radiante";

printf("O Herói de nome %d está no nível de %d", heroi, nivel); 
}