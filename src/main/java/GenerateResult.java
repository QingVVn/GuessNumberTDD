public class GenerateResult {
    private int allCorrectNumber = 0;
    private int valueCorrectNumber = 0;

    public void setAllCorrectNumber() {
        this.allCorrectNumber +=1;
    }

    public void setValueCorrectNumber() {
        this.valueCorrectNumber +=1;
    }

    public String GetResult()
    {
        return allCorrectNumber + "A"+ valueCorrectNumber + "B";
    }
}
