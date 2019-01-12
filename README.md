# 1002-modificacao-formas-polimorfismo
No exercício anterior, você criou uma hierarquia MyShape em que as classes MyLine, MyOval e MyRectangle estendem MyShape diretamente. Se sua hierarquia foi projetada adequadamente, você deve ser capaz de ver as semelhanças entre as classes MyOval e MyRectangle. Reprojete e reimplemente o código para as classes MyOval e MyRectangle para “fatorar” os recursos comuns na classe abstrata MyBoundedShape a fim de produzir a hierarquia na Figura 10.18.
A classe MyBoundedShape deve declarar dois construtores que simulam os construtores da classe MyShape, somente com um parâ-
metro adicionado para especificar se a forma é preenchida. A classe MyBoundedShape também deve declarar os métodos get e set para
manipular o flag preenchido e os métodos que calculam a coordenada x superior esquerda, coordenada y superior esquerda, largura e altura. Lembre-se de que os valores necessários para desenhar uma oval ou um retângulo podem ser calculados a partir de duas coordenadas
(x,y). Se você projetou adequadamente, as novas classes MyOval e MyRectangle devem cada uma ter dois construtores e um método
desenhar.
