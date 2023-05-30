
package bancosenai;

public class Gerente extends Usuario {
    
    private String login;
    private String password;

    public Gerente() {
    }

    public Gerente(String login, String password, String nm, String snome, String tel) {
        this.setNome(nm);
        this.setSobrenome(snome);
        this.setTelefone(tel);
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String imprimirInfo(){
        return String.format("INFORMAÇÕES DO GERENTE\n" + 
                "Nome: %s $s\n" + "Contato: %s\n" + "Login: %s", 
                this.getNome(), this.getSobrenome(), this.getTelefone(), this.getLogin());
    }
    
}
