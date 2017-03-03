public class Acceso
{
    private int ano;
    private int mes;
    private int dia;
    private int hora;
    private int minutos;
    
    public Acceso(String fecha)
    {
        String[] elementosLinea = fecha.split(" "); 
        
        this.ano = Integer.parseInt(elementosLinea[0]);
        this.mes = Integer.parseInt(elementosLinea[1]);
        this.dia = Integer.parseInt(elementosLinea[2]);
        this.hora = Integer.parseInt(elementosLinea[3]);
        this.minutos = Integer.parseInt(elementosLinea[4]);
    }
    
    public int getAno() 
    {
        return ano;
    }
    
    public int getMes()
    {
        return mes;
    }
    
    public int getDia()
    {
        return dia;
    }
    
    public int getHora()
    {
        return hora;
    }
    
    public int getMinutos()
    {
        return minutos;
    }
}