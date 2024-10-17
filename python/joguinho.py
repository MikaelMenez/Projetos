import pygame
#importa o módulo pygame
import random
#importa o módulo aleatório
from pygame.locals import*
#importa do submódulopygames
from sys import exit
#gera a possibilidade de fechar janela
from random import randint
#importa o módulo de aleatoriedade
from random import randrange
pygame.init()
#inicia o pygame
x = randint(50,550)
y = randint(50,750)
#assume um valor aleatório entre os intervalos
altura = 800
largura = 600
c = altura/2
z = largura/2
m = altura - 200
n = largura - 200
score = 10
bolotah = altura/2
bolotal = largura/2
horario = pygame.time.Clock()
A = randrange(1,10)
B = randrange(1,10)
#gera um objeto que se comporta como um limitador de frame
fonte = pygame.font.SysFont('arial', 20, False, False)
fontep = pygame.font.SysFont('comic sans', 50, True, True)
# variável que determina respectivamente o nome da fonte que quero usar, seu tamanho e se 
#ela está em negrito e/ou itálico
screen = pygame.display.set_mode((altura, largura))
#gera uma variável que guiará o tamanho da janela que será criada
pygame.display.set_caption("meu joguinho")
#nomeia a janela
while True:
#gera um loop
    mensagem = f'Score: {score}'
    vencedor = f'parabéns, você venceu'
    perdeu = f'perdeu seu otário do caralho'
     #indica o que aparecerá como texto
    pontuação = fonte.render(mensagem, False, (255,255,0))
    scorefinal = fonte.render(vencedor, False, (0,255,255))
    perdedor = fontep.render(perdeu, False, (255,255,255))
    #renderiza a fonte de acordo com a variável mensagem e vencedor,tb indica respectivamente
    #se haverá serrilhamento e sua cor
    horario.tick(60)
    #cria um framerate
    screen.fill((0,0,0))
    #retira o rastro de movimento
    for event in pygame.event.get():
#dita que acontecerá algo ao clicar nessa tecla
        if event.type == QUIT:
            pygame.quit()
            exit()
                    # fecha o jogo caso eu peça para fechar
        if event.type == KEYDOWN:
            if event.key == K_s:
                z = z + 40
            if event.key == K_w:
                z = z - 40
            if event.key == K_a:
                c = c - 40
            if event.key == K_d:
                c = c + 40
        #gera o movimento de acordo com as teclas pressionadas
    if pygame.key.get_pressed()[K_a]:
        c = c - 10
    if pygame.key.get_pressed()[K_s]:
        z = z + 10
    if pygame.key.get_pressed()[K_w]:
        z = z - 10
    if pygame.key.get_pressed()[K_d]:
        c = c + 10
         #faz com que se for pressionado, o personagem ainda se movimente
    if z > altura:
        z = 0
    if c > largura:
        c = 0
    if c < 0:
        c = largura
    if z < 0:
        z = altura
   #faz com que ele volte caso saia da tela
    ballv = pygame.draw.circle (screen,(255,100,255), (c,z), 15)
    ret = pygame.draw.rect(screen, (255,255,255), (x,y,20,20))
    balli = pygame.draw.circle (screen, (255,0,0), (m,n), 10)
    #desenha os objetos na tela
    x = x + 2
    y = y - 1.5
    m = m -2 
    n = n + 1.5

    # faz com que se movimente o objeto em 1 unidade
    if ballv.colliderect(ret):
        x = randint(100,550)
        y = randint(200,750)
          #faz com que o retângulo assuma uma posição aleatória quando encosta na bola
        score = score + 10
 #adiciona uma pontuação quando a bola encosta no retângulo
    if ballv.colliderect(balli):
        screen.blit(perdedor, (50,300))
        pygame.time.wait(2500)
        #gera um delay
        score == 0
       #tudo isso gera a tela de game over
    if y > altura - 300:
        y = largura - 100
    if x > largura:
        x = 0
    if x < 0:
        x = largura
    if y < 0:
        y = altura
    if m > altura - 300:
        m = largura - 100
    if n > largura:
        n = 0
    if n < 0:
        n = largura
    if m < 0:
        m = altura
    #ambos os if's fazem o objeto reaparecer na tela
    if score >=100:
        screen.blit(scorefinal, (580,570))
        #gera o parabéns
    screen.blit(pontuação, (0,0))
    #gera o texto na tela
    pygame.display.update()
    #atualiza a tela
