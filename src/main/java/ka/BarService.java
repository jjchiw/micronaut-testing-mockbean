package ka;

public interface BarService {
    public <R, C extends Command<R>> R send(C command);
}
