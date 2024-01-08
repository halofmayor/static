import java.util.Objects;


public class User {

        private String firstName;
        private String lastName;

        public User(String firstName, String lastname){
            this.firstName = firstName;
            this.lastName = lastname;
        }

        public void setFirstName(String firstName){
            this.firstName = firstName;
        }

        public void setLastName(String lastName){
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String output() {
            return firstName.toUpperCase() + " " + lastName.toUpperCase();
        }

        public String output(boolean showLastName) {
            if(showLastName) {
                return  output();
            }
            return firstName;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User users = (User) o;
            return Objects.equals(firstName, users.firstName) && Objects.equals(lastName, users.lastName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(firstName, lastName);
        }

        public String toString(){
            return "User {" +
                    "firstname = " + firstName + "," +
                    "lastName = " + lastName + "}";
        }
    }

