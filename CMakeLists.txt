set(CMAKE_CXX_STANDARD 20)
set(CMAKE_CXX_STANDARD_REQUIRED 20)

add_executable(experiments
        playground/experiments/foo.cpp
        playground/experiments/main.cpp
        fundamentals/ownership/ownership.cpp
)

add_executable(understanding
        playground/experiments/understanding/pytagoras.cpp
        playground/experiments/understanding/main.cpp
        playground/experiments/understanding/pytagoras.hpp
)
add_executable(ownership fundamentals/ownership/ownership.cpp)
