package Inloop.Exam.Part_Management;

public interface StockObserver {

    public void onPartCountChanged(Part part, int count);

}