import lombok.RequiredArgsConstructor;

public class Constants {
    @RequiredArgsConstructor
    public enum myEnum {
        North, East, South, West, NorthEast, NorthWest, SouthEast, SouthWest, Attack, RunAway, Talk
    }

    public Constants() {
    }

}
