public class Agenda {

    private Contato[] arrayContatos = new Contato[10];

    public void addContato(Contato c){

        for(int i = 0; i < arrayContatos.length; i++){

            if(arrayContatos[i] == null){

                arrayContatos[i] = c;

                break;

            }

        }

    }

    public void setContato(int i, Contato c){

        this.arrayContatos[i] = c;

    }

    public Contato getContato(int i){

        return this.arrayContatos[i];

    }

    public void remContato(int i){

        arrayContatos[i] = null;

    }

    public void pesquisaTelefone(String nome){

        for (int i = 0; i < this.arrayContatos.length; i++){

            if(this.arrayContatos[i].getNome().equals(nome)){

                System.out.println(arrayContatos[i].getTelefone());

                break;

            }

        }

    }

}
