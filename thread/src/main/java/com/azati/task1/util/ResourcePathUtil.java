package com.azati.task1.util;

import com.azati.task1.exception.PortException;

import java.net.URL;

public class ResourcePathUtil {
    public static String getResourcePath(String resourceName) throws PortException {
        final int pathStartPosition = 6;
        ClassLoader loader = ResourcePathUtil.class.getClassLoader();
        URL resource = loader.getResource(resourceName);
        if (resource == null) {
            throw new PortException("Resource " + resourceName + " is not found");
        }
        return resource.toString().substring(pathStartPosition);
    }
}
