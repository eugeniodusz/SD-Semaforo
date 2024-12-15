# Análise Comparativa

O programa `Carro.java` utiliza a classe `Semaphore` para controlar o número de vagas no estacionamento. O `Semaphore` garante que apenas um número máximo de carros (10) ocupe as vagas simultaneamente.

Por outro lado, `CarroLock.java` utiliza a classe `Lock`, mas não implementa nenhuma restrição para o número de carros. Isso faz com que todos os carros possam acessar as "vagas" ao mesmo tempo, ignorando o conceito de limite.

A principal diferença está na funcionalidade e no controle:
- `Semaphore` é mais adequado para cenários com limites fixos de recursos.
- `Lock` pode ser útil em situações de exclusão mútua simples, mas precisa de lógica adicional para gerenciar limites.


