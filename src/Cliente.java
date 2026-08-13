import java.util.Date;

public class Cliente extends Pessoa{

    private String formaPagamento;
    private Boolean fidelizado;
    private Boolean reserva;

    public Cliente(String nome, String cpf, Integer idade, Date dataNascimento, String formaPagamento, Boolean fidelizado, Boolean reserva) {
        super(nome, cpf, idade, dataNascimento);
        this.formaPagamento = formaPagamento;
        this.fidelizado = fidelizado;
        this.reserva = reserva;
    }

    //#region Getter e Setters da classe(Encapsulamento)
    public String getFormaPagamento() {
        return formaPagamento;
    }
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    public Boolean getFidelizado() {
        return fidelizado;
    }
    public void setFidelizado(Boolean fidelizado) {
        this.fidelizado = fidelizado;
    }
    public Boolean getReserva() {
        return reserva;
    }
    public void setReserva(Boolean reserva) {
        this.reserva = reserva;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "formaPagamento='" + formaPagamento + '\'' +
                ", fidelizado=" + fidelizado +
                ", reserva=" + reserva +
                '}';
    }
    //#endregion
}
