import java.util.Hashtable;

public class Student {
    String name;  // 学生の名前
    Hashtable<String , Subject> grades;  // 受講科目

    public Student(String myName) {
        name = myName;
        grades = new Hashtable<String,Subject>();
    }

    public int take(String kamoku, int unit, int score) {

    Subject sub;
    String grade_letter;
    int errors = 0;
    
    if(score >= 90)
        grade_letter = "S";
    else if(score >= 80)
        grade_letter = "A";
    else if(score >= 70)
        grade_letter = "B";
    else if(score >= 60)
        grade_letter = "C";
    //落第
    else grade_letter = "D"; 

    //エラー確認
    if(kamoku == null || kamoku.length() == 0) {
        errors++;
    }
    if(unit < 1) {
        errors += 2;
    }
    if(score > 100 || score < 0) {
        errors += 4;
    }

    //何もなければHashTableにputして終了
    if(errors == 0) {
        sub = new Subject(unit, grade_letter);
        grades.put(kamoku, sub);
        return 0;
        }
    else return errors;
    }

    public int getTotalUnit() {
        String[] kamoku = grades.keySet().toArray(new String[grades.keySet().size()]);
        Subject sub;
        int sum = 0;

        for(String k : kamoku) {
            sub = grades.get(k);
            sum += sub.getUnit();
        }

        return sum;
    }

    public float getGPA() {

        int sum = 0;
        Subject sub;

        String[] kamoku = grades.keySet().toArray(new String[grades.keySet().size()]);
        for(String k : kamoku) {

            sub = grades.get(k);

            if(sub.getPoint() == "S")
                sum += 4 * sub.getUnit();
            else if(sub.getPoint() == "A")
                sum += 3 * sub.getUnit();
            else if(sub.getPoint() == "B")
                sum += 2 * sub.getUnit();
            else if(sub.getPoint() == "C")
                sum += 1 * sub.getUnit();
        }

        return (float)sum / this.getTotalUnit(); 
    }

    public int judge() {
        if(this.getTotalUnit() >= 10) {
            if(this.getGPA() >= 2.5) {
                return 0; //卒業可 
            }
            else return 2; //GPA不足
        }
        else return 1; //単位不足
    }
}
