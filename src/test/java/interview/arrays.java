package interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class arrays {
    public static void main(String[] args) {
        //Hello Baaber

        /*
        You've been tasked with building a playlist of tracks so that users can preview songs by
        different artists playing at a concert they want to attend.
        Implement the build function such that it returns an array of tracks that meet the following conditions:
         The "primary" artists' n'th track should be played before any other artists' n'th track  A track from each artist
        should be played before we play a second track from any given artist. No artists' n'th track should play before any artists's n-1 track.
        This program should be written using java

        public Track[] build(Artist[] artists) {
  // Create an empty list of tracks
  List<Track> tracks = new ArrayList<>();

  // Find the primary artist
  Artist primaryArtist = null;
  for (Artist artist : artists) {
    if (artist.isPrimary()) {
      primaryArtist = artist;
      break;
    }
  }

  // If there is no primary artist, return an empty array
  if (primaryArtist == null) {
    return new Track[0];
  }

  // Add the primary artist's tracks to the playlist
  for (Track track : primaryArtist.getTracks()) {
    tracks.add(track);
  }

  // Add tracks from the other artists to the playlist
  for (Artist artist : artists) {
    if (artist == primaryArtist) {
      // Skip the primary artist
      continue;
    }

    // Add the artist's first track to the playlist
    tracks.add(artist.getTracks()[0]);
  }

  // Return the playlist as an array
  return tracks.toArray(new Track[tracks.size()]);
}

         */


    }
}
