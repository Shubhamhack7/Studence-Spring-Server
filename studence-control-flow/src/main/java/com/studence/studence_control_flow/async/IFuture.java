package com.studence.studence_control_flow.async;


/**
 * Represents a custom future interface supporting a blocking `get()` and async completion callbacks.
 *
 * @param <R> The result type returned by this future
 * @param <E> The type of exception that might be thrown during computation
 */
public interface IFuture<R, E extends Exception> {

    /**
     * Returns the result of the asynchronous computation, blocking if necessary.
     *
     * @return the computed result
     * @throws E if the computation failed or was interrupted
     */
    R get() throws E;

    /**
     * Adds a callback to be executed once the computation is complete.
     *
     * @param callback the callback to run after completion
     */
    void addDoneCallback(IDoneCallback callback);

    /**
     * Checks whether the computation is complete.
     *
     * @return true if completed, false otherwise
     */
    boolean isDone();
}