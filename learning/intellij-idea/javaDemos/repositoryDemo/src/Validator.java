public class Validator {
    public <T extends IEntity> void  validate(T entity){  // generic methods
        Validator validator = new Validator ();
        Customer customer = new Customer ();
        validator.validate (customer);
    }
}
