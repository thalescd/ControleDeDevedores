package controlededevedores;

public class Venda {

    private String cliente;
    private int codigoVenda;
    private int[] data;
    private double preco;
    private String observacao;
    private boolean pago;

    public Venda() {
        data = new int[3];
    }

    public Venda(String linhaCsv) {
        data = new int[3];
        String[] dados = linhaCsv.replace(";", ";¨").split(";");
        for (int i = 0; i < dados.length; i++) {
            dados[i] = dados[i].replace("¨", "");
        }
        this.cliente = dados[0];
        setCodigoVenda(dados[1]);
        setData(dados[2]);
        setPreco(dados[3]);
        this.observacao = dados[4];
        this.pago = Boolean.parseBoolean(dados[5]);
    }

    public int getCodigoVenda() {
        return codigoVenda;
    }

    public boolean setCodigoVenda(String codigoVenda) {
        try {
            this.codigoVenda = Integer.parseInt(codigoVenda);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String getData() {
        return data[0] + "-" + data[1] + "-" + data[2];
    }
    
    public int getData(int i) {
        return data[i];
    }
    
    public boolean setData(Object dia, Object mes, Object ano) {
        try {
            switch ((int) mes) {
                case 2:
                    if ((int) dia > 29) {
                        return false;
                    }
                    break;
                case 4:
                    if ((int) dia > 30) {
                        return false;
                    }
                    break;
                case 6:
                    if ((int) dia > 30) {
                        return false;
                    }
                    break;
                case 9:
                    if ((int) dia > 30) {
                        return false;
                    }
                    break;
                case 11:
                    if ((int) dia > 30) {
                        return false;
                    }
                    break;
            }
            this.data[0] = (int) dia;
            this.data[1] = (int) mes;
            this.data[2] = (int) ano;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean setData(String data) {
        try {
            String[] str = data.split("-");
            for (int i = 0; i < 3; i++) {
                this.data[i] = Integer.parseInt(str[i]);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public double getPreco() {
        return preco;
    }

    public boolean setPreco(String preco) {
        try {
            this.preco = Double.parseDouble(preco.replace(",", "."));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getCliente() {
        return cliente;
    }

    public Boolean setCliente(String cliente) {
        if (cliente.replace(" ", "").length() > 0) {
            this.cliente = cliente;
            return true;
        }
        return false;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public String getVenda() {
        StringBuilder sb = new StringBuilder();
        //sb.append(this.id).append(";");
        sb.append(this.cliente).append(";");
        sb.append(this.codigoVenda).append(";");
        sb.append(getData()).append(";");
        sb.append(this.preco).append(";");
        sb.append(this.observacao).append(";");
        sb.append(this.pago).append(";");
        sb.append("\n");
        return sb.toString();
    }

}
