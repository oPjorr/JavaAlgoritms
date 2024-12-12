## 2558. Pegue presentes da pilha mais rica

      Você recebe um array de inteiros giftsdenotando o número de presentes em várias pilhas. A cada segundo, você faz o seguinte:

Escolha a pilha com o maior número de presentes.
Se houver mais de uma pilha com o número máximo de presentes, escolha qualquer uma.
Deixe para trás o piso da raiz quadrada do número de presentes na pilha. Pegue o resto dos presentes.
Retorna o número de presentes restantes após ksegundos.



Exemplo 1:

Entrada: presentes = [25,64,9,4,100], k = 4
Saída: 29
Explicação:
Os presentes são recebidos da seguinte forma:
- No primeiro segundo, a última pilha é escolhida e 10 presentes são deixados para trás.
- Então a segunda pilha é escolhida e 8 presentes são deixados para trás.
- Depois disso, a primeira pilha é escolhida e 5 presentes são deixados para trás.
- Por fim, a última pilha é escolhida novamente e 3 presentes são deixados para trás.
  Os presentes restantes finais são [5,8,9,4,3], então o número total de presentes restantes é 29.
  Exemplo 2:

Entrada: presentes = [1,1,1,1], k = 4
Saída: 4
Explicação:
Neste caso, independentemente da pilha que você escolher, você deve deixar 1 presente em cada pilha.
Ou seja, você não pode levar nenhuma pilha com você.
Então, o total de presentes restantes é 4.