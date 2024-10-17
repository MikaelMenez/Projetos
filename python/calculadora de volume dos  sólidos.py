//calculadora de volume de sólidos
//caso queija ajudar a melhora o código, só adicionar comentários
pi = float 
pi = 3.14
print('olá, sou a calculadora de volume de sólidos')
sol = input ('qual o sólido desejado? ')
if sol == 'esfera':
    r = float(input('qual o raio da sua esfera em cm? '))
    result = pi*r*r*r*4/3
    print ('o valor é: ', result ,'cm³')
elif sol == 'Esfera':
    r = float(input('qual o raio da sua esfera em cm? '))
    result = pi*r*r*r*4/3
    print ('o valor é: ', result ,'cm³')
elif sol == 'Cubo':
    l = float(input('qual a medida em cm do lado do seu cubo? '))
    result = l*l*l
    print ('o valor é: ', result ,'cm³')
elif sol == 'cubo':
    l = float(input('qual a medida em cm do lado do seu cubo? '))
    result = l*l*l
    print ('o valor é: ', result ,'cm³')
elif sol == 'prisma':
    h = float(input('qual a altura do seu prisma em cm? '))
    a = float(input('qual a área da base do seu prisma em cm²? '))
    result = h*a
    print ('o valor é: ', result ,'cm³')
elif sol == 'Prisma':
    h = float(input('qual a altura do seu prisma em cm? '))
    a = float(input('qual a área da base do seu prisma em cm²? '))
    result = h*a
    print ('o valor é: ', result ,'cm³')
elif sol == 'pirâmide':
    h = float(input('qual a altura da sua pirâmide em cm? '))
    a = float(input('qual a área da base da sua pirâmide em cm²? '))
    result = h*a/3
    print ('o valor é: ', result ,'cm³')
elif sol == 'Pirâmide':
    h = float(input('qual a altura da sua pirâmide em cm? '))
    a = float(input('qual a área da base da sua pirâmide em cm²? '))
    result = h*a/3
    print ('o valor é: ', result ,'cm³')
elif sol == 'piramide':
    h = float(input('qual a altura da sua pirâmide em cm? '))
    a = float(input('qual a área da base da sua pirâmide em cm²? '))
    result = h*a/3
    print ('o valor é: ', result ,'cm³')
elif sol == 'Piramide':
    h = float(input('qual a altura da sua pirâmide em cm? '))
    a = float(input('qual a área da base da sua pirâmide em cm²? '))
    result = h*a/3
    print ('o valor é: ', result ,'cm³')
elif sol == 'Cone':
    h = float(input('qual a altura dso seu cone em cm? '))
    a = float(input('qual a área da base do seu cone em cm²? '))
    result = h*a/3
    print ('o valor é: ', result ,'cm³')
elif sol == 'cone':
    h = float(input('qual a altura dso seu cone em cm? '))
    a = float(input('qual a área da base do seu cone em cm²? '))
    result = h*a/3
    print ('o valor é: ', result ,'cm³')
elif sol == 'cilindro':
    h = float(input('qual a altura do seu cilindro em cm? '))
    a = float(input('qual a área da base do seu cilindro em cm²? '))
    result = h*a
    print ('o valor é: ', result ,'cm³')
elif sol == 'Cilindro':
    h = float(input('qual a altura do seu cilindro em cm? '))
    a = float(input('qual a área da base do seu cilindro em cm²? '))
    result = h*a
    print ('o valor é: ', result ,'cm³')
else:
    print ('este objeto não é suportado')
