from cProfile import run


class probarMes:
    resp = int

    def mes(x):
        if (x == 1 or x == 3 or x == 5 or x == 7 or x == 8 or x == 10 or x == 12 ):
            a = "31 dias"
        elif (x == 2):
            a = ("28 o 29 dias")
        elif (x==4 or x==6 or x==9 or x==11):
            a = ("30 dias")
        else:
            a = "Error"
        return a;


def run():
    mesn = 0
    mes = input("Dame un mes\n")

    mes = mes.lower()
    if (mes == "enero"):
            mesn = 1;
    elif (mes == "febrero"):
            mesn = 2;
    elif (mes == "marzo"):
            mesn = 3;
    elif (mes == "abril"):
            mesn = 4;
    elif (mes == "mayo"):
            mesn = 5;
    elif (mes == "junio"):
            mesn = 6;
    elif (mes == "julio"):
            mesn = 7;
    elif (mes == "agosto"):
            mesn = 8;
    elif (mes == "septiembre"):
            mesn = 9;
    elif (mes == "octubre"):
            mesn = 10;
    elif (mes == "noviembre"):
            mesn = 11;
    elif (mes == "diciembre"):
            mesn = 12;
    else:
            print("Ingresar un mes existente")
            
        
    probarMes1 = probarMes()
    print(probarMes1.mes(mesn))
        
if __name__ == '__main__':
    run()