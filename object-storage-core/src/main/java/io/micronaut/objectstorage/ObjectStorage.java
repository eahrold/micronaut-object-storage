/*
 * Copyright 2017-2022 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.objectstorage;

import java.util.Optional;

/**
 * Main interface for object storage operations.
 *
 * @author Pavol Gressa
 * @since 1.0
 */
public interface ObjectStorage {

    /**
     * Uploads an object to the object storage.
     *
     * @param uploadRequest the upload request
     * @return the upload response
     * @throws ObjectStorageException if there was a failure storing the object
     */
    UploadResponse put(UploadRequest uploadRequest) throws ObjectStorageException;

    /**
     * Get the object from object storage.
     *
     * @param key the object path in the format {@code /foo/bar/file}
     * @return the object, or empty optional if the object does not exist
     * @throws ObjectStorageException if there was a failure retrieving the object
     */
    Optional<ObjectStorageEntry> get(String key) throws ObjectStorageException;

    /**
     * Deletes an object from the object storage.
     *
     * @param key object path in the format {@code /foo/bar/file}
     */
    void delete(String key) throws ObjectStorageException;
}
