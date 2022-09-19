Algoritmo "CalcM"
// Disciplina   : [Linguagem e Lógica de Programação]
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 19/09/2022
Var
   n1, n2, resultado : real
   opcao, operacao : caractere


Inicio
   opcao <- ""
   n1 <- 0
   n2 <- 0
   resultado <- 0
   repita
      escreval("R: ",resultado)
      escreval("1 2 3 +")
      escreval("4 5 6 -")
      escreval("7 8 9 *")
      escreval("  0   /")
      se(opcao<>"C") entao
         escreva("N1: ")
         leia(n1)
      seNao
         n1 <- resultado
      fimSe
      leia(operacao)
      escreva("N2: ")
      leia(n2)
      escolha(operacao)
      caso "+"
         resultado <- n1+n2
      caso "-"
         resultado <- n1-n2
      caso "*"
         resultado <- n1*n2
      caso "/"
         resultado <- n1/n2
      outroCaso
         escreval("Caractere inválido")
      fimEscolha
      escreval(n1," ",operacao,n2," = ",resultado)
      escreval()
      escreval("C - Continuar")
      escreval("L - Limpar")
      escreval("F - Finalizar")
      leia(opcao)
      se(opcao = "L") entao
         resultado <- 0
      fimSe


   ate(opcao = "F")


Fimalgoritmo