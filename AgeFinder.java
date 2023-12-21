import java.time.LocalDate;
import java.time.Period;

public class AgeFinder {
LocalDate date = LocalDate.now();

public int getAge(LocalDate dateOfBirth) {
return Period.between(dateOfBirth, date).getYears();
}

public LocalDate getDateAfterNDays(int noOfDays) {
LocalDate today = LocalDate.now();
return today.plusDays(noOfDays);
}

public LocalDate getDateAfterXYearsYMonthsZDays(int year, int months, int days) {
return date.plusDays(days).plusMonths(months).plusYears(year);
}

public static void main(String[] args) {
LocalDate dob = LocalDate.of(1999, 10, 11);
AgeFinder age = new AgeFinder();
System.out.println("Your age is : "+age.getAge(dob)+" years");
System.out.println(("The date after 30 days is : "+ age.getDateAfterNDays(30)));
System.out.println("The date after 1 Year 2 Months & 3 Days is : "+age.getDateAfterXYearsYMonthsZDays(1, 1, 1));
}
}
