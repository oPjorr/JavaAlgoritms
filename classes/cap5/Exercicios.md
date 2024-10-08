# Exercícios da apostila(Cap 5)
1. O que é necessário fazer para garantirmos que os atributos da classe Conta não sejam acessados de forma direta em outra classe a qual não seja a própria classe Conta?

   <span style="color:red">R:</span> Para isso, o correto seria encapsular a propriedade deixando-a como <span style="color:lightskyblue">privada</span>.


2. Após deixar os atributos da classe Conta com acesso restrito (privado), tente criar uma Conta na classe TestaConta dentro do main e modificar ou ler os atributos da conta criada. O que acontece?
   <span style="color:red">R:</span> No IntelliJ, ele me dá um erro avisando que a propriedade tem acesso privado.

    - Crie apenas os getters e setters necessários na sua classe Conta. Pense sempre se é preciso criar cada um deles.

    - Não copie e cole! Aproveite para praticar a sintaxe. Logo, passaremos a usar o Eclipse e aí, sim, teremos procedimentos mais simples destinados a esse tipo de tarefa.

    - Repare que o método calculaRendimento parece também um getter. Aliás, seria comum alguém nomeá-lo de getRendimento. Getters não precisam apenas retornar atributos, eles podem trabalhar com esses dados.



3. Altere suas classes que acessam e modificam atributos de uma Conta para utilizar os getters e setters recém-criados.



4. Faça com que sua classe Conta possa receber, opcionalmente, o nome do titular da Conta durante a criação do objeto.



5. (Opcional) Adicione um atributo, na classe Conta de tipo int, que se chama identificador. Este deve ter um valor único para cada instância do tipo Conta. A primeira Conta instanciada tem identificador 1, a segunda, 2, e assim por diante. Você deve utilizar os recursos aprendidos aqui na resolução desse problema.


- Crie um getter para o identificador. Devemos ter um setter?
<span style="color:red">R:</span> Não precisamos de um setter para a resolução desse problema, pois se definirmos uma variável estática ela vai pertencer à classe, e por conta disso, basta apenas incrementá-la



6. (Opcional) Como garantir que datas como 31/2/2021 não sejam aceitas pela sua classe Data?



7. (Opcional) Imagine que tenhamos a classe PessoaFisica a qual tem um CPF como atributo. Como garantir que alguma pessoa física tenha CPF inválido e tampouco seja criada uma PessoaFisica sem CPF inicial? (Suponha que já exista um algoritmo de validação de CPF: este deve passar por um método valida(String x)....)