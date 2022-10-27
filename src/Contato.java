public class Contato {

    private String nome;

    private String telefone;

    private String celular;

    private String email;

    public Contato(String nome, String telefone){

        this.nome = nome;

        this.telefone = telefone;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void mostrarDados(){

        System.out.println(getNome());

        System.out.println(getCelular());

        System.out.println(getEmail());

        System.out.println(getTelefone());

    }

}
