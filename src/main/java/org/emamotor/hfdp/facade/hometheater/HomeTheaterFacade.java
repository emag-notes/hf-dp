package org.emamotor.hfdp.facade.hometheater;

public class HomeTheaterFacade {

    Amplifier     _amp;
    Tuner         _tuner;
    DvdPlayer     _dvd;
    CdPlayer      _cd;
    Projector     _projector;
    TheaterLights _lights;
    Screen        _screen;
    PopcornPopper _popper;

    public HomeTheaterFacade(
            Amplifier     amp,
            Tuner         tuner,
            DvdPlayer     dvd,
            CdPlayer      cd,
            Projector     projector,
            TheaterLights lights,
            Screen        screen,
            PopcornPopper popper
    ) {

        _amp       = amp;
        _tuner     = tuner;
        _dvd       = dvd;
        _cd        = cd;
        _projector = projector;
        _lights    = lights;
        _screen    = screen;
        _popper    = popper;
    }

    public void watchMovies(String movie) {
        System.out.println("映画を見る準備をします…");

        _popper.on();
        _popper.pop();

        _lights.dim(10);

        _screen.down();

        _projector.on();
        _projector.wideScreenMode();

        _amp.on();
        _amp.setDvd(_dvd);
        _amp.setSurroundSound();
        _amp.setVolume(5);

        _dvd.on();
        _dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("ムービーシアタを停止します…");

        _popper.off();

        _lights.on();

        _screen.up();

        _projector.off();

        _amp.off();

        _dvd.stop();
        _dvd.eject();
        _dvd.off();
    }

}
