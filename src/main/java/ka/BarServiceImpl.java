package ka;

public class BarServiceImpl implements BarService{
    @Override
    public <R, C extends Command<R>> R send(C command) {
        if (command == null) {
            return null;
        }
        return command.execute();
    }
}
