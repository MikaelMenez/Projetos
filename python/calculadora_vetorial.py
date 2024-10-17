def pveto():
    matriz=[[0,0,0],[0,0,0]]
    for l in range(0,2):
        for c in range(0,3):
            matriz[l][c]=float(input(f'escreva as coordenadas na base canônica em {l}{c}: '))
    itot=(matriz[0][1]*matriz[1][2])-(matriz[0][2]*matriz[1][1])
    jtot=-1*((matriz[0][0]*matriz[1][2])-(matriz[0][2]*matriz[1][0]))
    ktot=(matriz[0][0]*matriz[1][1])-(matriz[0][1]*matriz[1][0])
    print(f"o resultado do produto vetorial é {itot}i {jtot}j {ktot}k")  
def pprodint():
    vetor1=[0,0,0]
    vetor2=[0,0,0]
    for v1 in range(0,3):
        vetor1[v1]=float(input(f'escreva a {v1+1}° coordenada na base canônica do primeiro vetor: '))
    for v2 in range(0,3):
        vetor2[v2]=float(input(f'escreva a {v2+1}° coordenada na base canônica do primeiro vetor: '))
    print(f'o resultado do produto interno é: {(vetor1[0]*vetor2[0])+(vetor1[1]*vetor2[1])+(vetor1[2]*vetor2[2])}')
def pescalar():
    vetor=[0,0,0]
    escalar=0
    for v in range(0,3):
        vetor[v]=float(input(f'escreva a {v+1}° coordenada na base canônica: '))
    escalar=float(input("qual o escalar que deseja multiplicar? "))
    print(f'as novas coordenadas são: {escalar*vetor[0]}i {escalar*vetor[1]}j {escalar*vetor[2]}k')
def pmisto():
  matriz=[[0,0,0],[0,0,0]]
  vetor1=[0,0,0]
  for l in range(0,2):
    for c in range(0,3):
            matriz[l][c]=float(input(f'escreva as coordenadas na base canônica em {l}{c}: '))
  for v1 in range(0,3):
    vetor1[v1]=float(input(f'escreva a {v1+1}° coordenada na base canônica do vetor c: '))
  itot=(matriz[0][1]*matriz[1][2])-(matriz[0][2]*matriz[1][1])
  jtot=-1*((matriz[0][0]*matriz[1][2])-(matriz[0][2]*matriz[1][0]))
  ktot=(matriz[0][0]*matriz[1][1])-(matriz[0][1]*matriz[1][0])
  print(f'o resultado do produto misto é: {(vetor1[0]*itot)+(vetor1[1]*jtot)+(vetor1[2]*ktot)}')
opera=input('''qual sua operação com vetores escolhida? utilize 'X' para produto vetorial,'p' para produto interno,'e' para produto escalar,'m' para produto misto e 'z' para sair: ''')
opera=opera.upper()
while opera!="Z":
    if opera=="X":
     pveto()
    elif opera== "P":
     pprodint()
    elif opera== "E":
     pescalar()
    elif opera== "M":
     pmisto()
    elif opera== "Z":
     break
    else:
     print('essa não é uma operação válida')
    opera=input('''qual sua operação com vetores escolhida? utilize 'X' para produto vetorial,'p' para produto interno e 'e' para produto escalar e 'z' para sair: ''')
    opera=opera.upper()
     
