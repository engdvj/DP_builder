package examples.davijr.classes;

public record Cliente(String id, String nome, String cpf, String email,ClienteTiposEnum tipo) {
    @Override
    public String toString() {
        return "Cliente{" +
               "id='" + id + '\'' +
               ", nome='" + nome + '\'' +
               ", cpf='" + cpf + '\'' +
               ", email='" + email + '\'' +
               ", tipo=" + tipo +
               '}';
    }
}



