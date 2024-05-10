public class Calcular {



    public void calcularcontagem (int parametro1, int parametro2 ){
        if (parametro1 < parametro2){
            throw new IllegalArgumentException
                    ("Atenção: o  primeiro parametro nao pode ser menor que o segundo");
        }

        else {
            int contagem = parametro1 - parametro2;

            for (int i = 1; i < contagem +1 ; i++) {


                System.out.println("Contagem: " + i);
            }
            System.out.println("Contagem realizada, Total: " + contagem);
        }
    }
    }

