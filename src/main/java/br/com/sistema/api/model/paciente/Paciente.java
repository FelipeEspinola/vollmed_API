package br.com.sistema.api.model.paciente;

import br.com.sistema.api.model.endereco.Endereco;
import br.com.sistema.api.model.medico.DadosCadastroMedico;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "pacientes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome ;
    private String email;
    private String telefone;
    private String cpf;

    @Embedded   //  Utilizando na classe que representa a tabela principal no BD
    private Endereco endereco;

    // Método Construtor recebendo o DTO DadosCadastroMedico e conectando a um objeto médico
    public Paciente(DadosCadastroPaciente dados){
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.cpf = dados.cpf();
        this.endereco = new Endereco(dados.endereco());
    }
    
}
