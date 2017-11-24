package org.photolog;

import java.nio.file.*;
import java.util.function.*;

public final class JpegPathMatcher implements Predicate<Path> {
    private final PathMatcher matcher;

    public JpegPathMatcher(Path root) {
        matcher = root.getFileSystem().getPathMatcher("glob:**/*.{jpg,jpeg}");
    }

    @Override
    public boolean test(Path path) {
        return matcher.matches(path);
    }
}
