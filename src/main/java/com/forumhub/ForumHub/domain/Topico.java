package com.forumhub.ForumHub.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "topicos")
@Entity(name = "Topicos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensagem;
    private String autor;
    private String curso;
    @Column(name = "is_deleted")
    private boolean deleted;

    public Topico(DadosCadastroTopico dados){
        this.titulo = dados.titulo();
        this.mensagem = dados.mensagem();
        this.autor = dados.autor();
        this.curso = dados.curso();
    }

   public void atualizarInformacoes(DadosAtualizacaoTopico dados){
       if (dados.titulo() != null) {
           this.titulo = dados.titulo();
       }
       if (dados.mensagem() != null) {
           this.mensagem = dados.mensagem();
       }
       if (dados.autor() != null) {
           this.autor = dados.autor();
       }
       if (dados.curso() != null) {
           this.curso = dados.curso();
       }
   }

    public void excluir() {
        this.deleted = true;
    }
}
